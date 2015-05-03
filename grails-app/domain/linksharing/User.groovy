package linksharing

class User {
	String email
	String username
	String password
	String firstName
	String lastName
	byte photo
	Boolean admin
	Boolean active
	Date dateCreated
	Date lastUpdated

    static constraints = {
    }
	
	static hasMany = [topics:Topic, subs:Subscription, rr:ResourceRating,readingitem:ReadingItem]
}
