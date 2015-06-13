package linksharing

class Resource {
//	User creator
	String description
	String title
	Date dateCreated
	Date lastUpdated

    
	static hasMany=[readingItems:ReadingItem,resourceRatings:ResourceRating]
	static belongsTo=[topic:Topic]
	static mapping = {
	tablePerHierarchy false
	}
	static constraints = {
	title (unique:'topic')
	description ( size:1..1024)
	}
	String toString()
	{
	return description;
	}
	
}
