package spring.lecture.notes;

public class ServicesNotes {

// Services
		// Service is special type of class that provides a way to interact
		//	with some functionality in the application in a simpler way.
				// Can provide different types of functionality such as:

						// + uploading files
						// + interacting with database tables
						// + interacting with an external api

		// ********* Services allow us to decouple specific logic for performing actions like the
		//	 			above from the rest of our application. **********


				// Example service for ads that stores ads in an array list

					//			@Service
					//			class AdService {
					//			    private List<Ad> ads;
					//
					//			    public AdService() {
					//			        ads = new ArrayList<>();
					//			        createAds();
					//			    }
					//
					//			    public List<Ad> all() {
					//			        return ads;
					//			    }
					//
					//			    public Ad create(Ad ad) {
					//			        ad.setId(ads.size() + 1);
					//			        ads.add(ad);
					//			        return ad;
					//			    }
					//
					//			    public Ad one(long id) {
					//			        return ads.get(id - 1);
					//			    }
					//
					//			    private void createAds() {
					//			        // create some ad objects and add them to the ads list
					//			        // using the create method
					//			    }
					//			}

				// "@Service" annotation tells spring this is a class that'll be managed by spring.
				//		"createAds" method, and calling it from constructor, is just for demonstration purposes.
				// 		In reality, our services would be doing something more complex than keeping an "ArrayList"
				//		of objects.

// Dependency Injection
		// fancy way to say passing things into constructor of an object. Spring provides us some facilities
		//	to use "automatic" dependency injection in our classes.

				// Example shows how we can inject our ads service into our ads controller:

					//			@Controller
					//			class AdController {
					//			    private final AdService adService;
					//
					//			    public AdController(AdService adService) {
					//			        this.adService = adService;
					//			    }
					//			    // ...
					//			}

				// We can use dependency injection in most of the classes in our spring application.
				// We can even inject services into other services!

// A Note on Naming Conventions
	//

}
