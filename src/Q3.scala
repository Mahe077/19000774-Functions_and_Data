object Q3 extends App{
  class Account(n1:String,n2:Int,n3:String,n4:Double){
    val nic = n1;
    val ac_no = n2;
    val name = n3;
    var balance = n4;
    
    def withdraw(a:Double) = (this.balance = this.balance-a)
    def deposit(a:Double) = (this.balance = this.balance+a)
    def transfer(a:Account,b:Double) = {this.withdraw(b) 
        a.deposit(b)}
    override def toString = "[" + nic + "," + ac_no + "," + name + "," + balance + "]"
  }
  var A1 = new Account("199830610254",302556985,"Mahesh",-325.6)
  var A2 = new Account("199930610124",123465985,"Lakshan",57465.84)
  println(A1);
  println(A2);
//  A1.withdraw(20)
//  println(A1)
//  A1.deposit(50)
//  println(A1)
  A1.transfer(A2, 50);
  println(A1);
  println(A2);
}