import Q3.Account

object Q4 extends App{
  var bank:List[Account] = List()
 
  var Print = (a:List[Account])=>(a.map(x => println(x)));
  val find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n))
  val overdraft = (b:List[Account])=>b.filter(x => (x.balance < 0))
  val sum  = (b:List[Account])=> b.reduce((x,y) => new Account("",0,"",x.balance + y.balance)).balance
  val cal =(x:Account)=>if(x.balance < 0) x.balance * 0.1  else x.balance*0.05
  val interest=(b:List[Account])=>b.map(x => x.deposit(cal(x)))
  
  var A1 = new Account("199830610254",302556985,"Mahesh",325.6)
  var A2 = new Account("199930610124",123465985,"Lakshan",57465.84)  
  var A3 = new Account("254630610254",325463185,"Peterson",-54.6)
  var A4 = new Account("154856610124",112485985,"Jackie",45000)
  bank = List(A1,A2,A3,A4)
//  Print(bank)
  println(overdraft(bank))
  println("Sum " + sum(bank))
  interest(bank)
  Print(bank)
}
