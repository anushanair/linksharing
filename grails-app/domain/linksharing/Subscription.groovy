package linksharing

class Subscription {
	Date datecreated
	Seriousness seriousness
	
static belongsTo=[user:User,topic:Topic]
static constraints = {
user unique:'topic'
seriousness blank:false,nullable:false
}
}
