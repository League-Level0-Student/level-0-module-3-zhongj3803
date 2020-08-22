for (int i = 100; i>0;i--) {
 if (i==1) {
  println(i+" bottle of beer on the wall,");
  println(i+" bottle of beer!");
  println("take one down");
  println("pass it around");
  println("no bottles of beer on the wall");
}
 else {  
  println(i+" bottles of beer on the wall,");
  println(i+" bottles of beer!");
  println("take one down");
  println("pass it around");
  if (i==2) {
    println("1 bottle of beer on the wall");
  }
  else {
  println(i-1+" bottles of beer on the wall");
  }
 }
}
