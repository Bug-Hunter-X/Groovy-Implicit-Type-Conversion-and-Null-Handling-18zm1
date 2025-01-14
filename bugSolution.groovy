```groovy
def myMethod(arg) {
  if (arg == null) {
    return 0
  } else if (arg instanceof Integer) {
    return arg * 2
  } else if (arg instanceof List) {
    return arg.sum() // Or perform another appropriate operation on the list
  } else {
    throw new IllegalArgumentException("Unsupported argument type: "+ arg.class)
  }
}

println myMethod(null)     //Prints 0
println myMethod(5)       //Prints 10
println myMethod([1,2,3]) //Prints 6
println myMethod("hello") //Throws exception
```