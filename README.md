# FinalProject

public List<Product> getSimilarProducts(String category, String subcategory, Integer productId){
		// getting list of products based on category and subcategory
		List<Product> list = getProducts(category, subcategory);
		
		List<Product> response = new ArrayList<>();
		
		Optional<Product> box = dao.findById(productId);
		if(box.isPresent()) {
			List<String> tagList = box.get().getTag();			
			for(Product p : list) {
				Set<String> result = tagList.stream()
						  .distinct()
						  .filter(
							  tag->{
								  for(String element : p.getTag()){
									  if(tag.replaceAll(" +", "").toLowerCase().contains(element)){
										  return true;
									  }
								  }
								  return false;
							  }
						  )
						  .collect(Collectors.toSet());
				
				if(result.size() > 0) {
					response.add(p);
				}
			}
		}
		return response;
	}
