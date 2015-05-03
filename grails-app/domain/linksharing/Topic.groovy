package linksharing

class Topic {
	String name
	User createdBy
	Date dateCreated
	Visibility visibility
	Date lastUpdated
    static constraints = {
	}
	
//	static belongsTo = [user:User]
	static hasMany=[subs:Subscription, resources:Resource]
	
	
}
