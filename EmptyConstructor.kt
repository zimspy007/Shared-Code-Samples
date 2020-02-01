//instead of doing:
val myClass(value, "value", null, null, null, null);

//you could do option 1:
//create a constructor with default values like:

data class MyClass(
		var name: String = "",
		var age: Int = -1,
		var myFriends: List<String> = emptyList()
	)

//..then later in your code you simply do
val fancyName = MyClass();

///option 2
/// Declare a secondary constructor that has no parameters:

data class MyClass(
		var name: String,
		var age: Int,
		var myFriends: List<String>,
	) {
		constructor() : this ("", -1, emptyList()
		)
	}