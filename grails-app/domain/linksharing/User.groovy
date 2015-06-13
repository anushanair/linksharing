package linksharing

class User {
	String email
	String username
	String password
	String firstName
	String lastName
	byte[] photo
	Boolean admin=false
	Boolean active=false
	Date dateCreated
	Date lastUpdated

	static hasMany=[topics:Topic,subscriptions:Subscription,readingItems:ReadingItem,resourceRatings:ResourceRating]
	static constraints = {
	photo (nullable:true)
	email(email: true,blank:false,unique:true)
	password (password:true,blank: false, nullable: false)
	}
	String toString()
	{
	return firstName+" "+lastName
	}
}
