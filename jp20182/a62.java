//static keyword
class distance
{
int ft;
static int inch;

static
{
System.out.println("From static block");
}

distance()
{
ft=0;
inch=0;
}

distance(int ft,int inch)
{
this.ft=ft;
this.inch=inch;
}

void show()
{
System.out.println(ft+"'"+inch+"\"");
}

static void display()
{
//System.out.println(ft); //error because static function can only 			   access static members


System.out.println(inch);
//show(); //error

distance k=new distance();
k.show(); //OK
k.ft=20;
}

}