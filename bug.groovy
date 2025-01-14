```groovy
def myMethod(arg) {
  if (arg == null) {
    return 0 // This line is problematic
  }
  return arg * 2
}

println myMethod(null) //Prints 0
println myMethod(5)   //Prints 10
println myMethod([1,2,3]) //Throws exception
```