class abc
{
void f()
{

}
}


class xyz extends abc
{
void f() throws ClassNotFoundException
{
throw new ClassNotFoundException();
}
}

/*

In case of overriding:
1) If super class function is not declaring any exception using throws clause then sub class overriding function can also not declare any exception using throws clause.

2) Overriding function must not have access specifier weaker than overriden function.


*/