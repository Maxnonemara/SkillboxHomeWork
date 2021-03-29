fun main() {
    var firstName = "Maxim"
    var lastName = "Maralev"
    var weight: Float = 90.3f
    var height: Int = 150
    var isChild: Boolean
    if (weight < 40 || height < 150) {
        isChild = true
    } else {
        isChild = false
    }
    var info: String = """
        $firstName
        $lastName
        $height
        $weight
        $isChild"""
    println(info)
    println("Введите свой рост")
    height = readLine()!!.toInt()
    if (weight < 40 || height < 150) {
        isChild = true
    } else {
        isChild = false
    }
    info = """
    $firstName
    $lastName
    $height
    $weight
    $isChild """
    println(info)

}