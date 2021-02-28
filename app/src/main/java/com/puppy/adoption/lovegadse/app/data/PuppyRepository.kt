package com.puppy.adoption.lovegadse.app.data

class PuppyRepository {
    fun puppies() = listOf(
        Puppy(
            name = "Joselo",
            description = "Very quiet pup",
            photoUrl = "https://images.pexels.com/photos/5732474/pexels-photo-5732474.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888",
            history = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu sodales orci. Curabitur tincidunt, lacus vel imperdiet pellentesque, mi purus porta risus, non bibendum neque augue in erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam id elit porttitor, suscipit enim at, interdum eros. Pellentesque nibh velit, iaculis ullamcorper felis sit amet, tempus fermentum nibh. Vestibulum vulputate gravida massa quis congue. Nullam fringilla ex sit amet augue aliquam, sit amet facilisis velit luctus. Donec tincidunt mi id nulla commodo, vel euismod justo fringilla. Vivamus vel lorem non mauris sagittis varius non eget nisi. In lobortis ligula leo, vel dapibus arcu vestibulum ut. Proin non purus neque. Donec vel felis id dui varius fringilla. Nulla mattis ultrices semper.",
        ),
        Puppy(
            name = "Michelina",
            description = "Super energetic but lovely",
            photoUrl = "https://images.pexels.com/photos/3818818/pexels-photo-3818818.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888",
            history = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu sodales orci. Curabitur tincidunt, lacus vel imperdiet pellentesque, mi purus porta risus, non bibendum neque augue in erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam id elit porttitor, suscipit enim at, interdum eros. Pellentesque nibh velit, iaculis ullamcorper felis sit amet, tempus fermentum nibh. Vestibulum vulputate gravida massa quis congue. Nullam fringilla ex sit amet augue aliquam, sit amet facilisis velit luctus. Donec tincidunt mi id nulla commodo, vel euismod justo fringilla. Vivamus vel lorem non mauris sagittis varius non eget nisi. In lobortis ligula leo, vel dapibus arcu vestibulum ut. Proin non purus neque. Donec vel felis id dui varius fringilla. Nulla mattis ultrices semper.",
        ),
        Puppy(
            name = "Paquita",
            description = "Clothes destroyer, be careful.. but will never harm people",
            photoUrl = "https://images.pexels.com/photos/2171583/pexels-photo-2171583.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888",
            history = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu sodales orci. Curabitur tincidunt, lacus vel imperdiet pellentesque, mi purus porta risus, non bibendum neque augue in erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam id elit porttitor, suscipit enim at, interdum eros. Pellentesque nibh velit, iaculis ullamcorper felis sit amet, tempus fermentum nibh. Vestibulum vulputate gravida massa quis congue. Nullam fringilla ex sit amet augue aliquam, sit amet facilisis velit luctus. Donec tincidunt mi id nulla commodo, vel euismod justo fringilla. Vivamus vel lorem non mauris sagittis varius non eget nisi. In lobortis ligula leo, vel dapibus arcu vestibulum ut. Proin non purus neque. Donec vel felis id dui varius fringilla. Nulla mattis ultrices semper.",
        ),
        Puppy(
            name = "Pedrin",
            description = "Loves to cuddle",
            photoUrl = "https://images.pexels.com/photos/69434/pexels-photo-69434.jpeg?w=400&q=30",
            ownerPhoneNumber = "09001728888",
            history = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu sodales orci. Curabitur tincidunt, lacus vel imperdiet pellentesque, mi purus porta risus, non bibendum neque augue in erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam id elit porttitor, suscipit enim at, interdum eros. Pellentesque nibh velit, iaculis ullamcorper felis sit amet, tempus fermentum nibh. Vestibulum vulputate gravida massa quis congue. Nullam fringilla ex sit amet augue aliquam, sit amet facilisis velit luctus. Donec tincidunt mi id nulla commodo, vel euismod justo fringilla. Vivamus vel lorem non mauris sagittis varius non eget nisi. In lobortis ligula leo, vel dapibus arcu vestibulum ut. Proin non purus neque. Donec vel felis id dui varius fringilla. Nulla mattis ultrices semper.",
        ),
    )

    fun findPuppy(puppyID: String) = puppies().find { it.name == puppyID }
}

data class Puppy(
    val description: String,
    val history: String,
    val name: String,
    val ownerPhoneNumber: String,
    val photoUrl: String,
)