package linksharing

class ReadingItem {
	Boolean isRead
	
	static belongsTo=[user:User,resource:Resource]
	String toString()
	{return resource}
	

    static constraints = {
    }
}
