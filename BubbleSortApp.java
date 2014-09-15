class  BubbleSortApp
{
public static void main(String[]args)
{
    
int max=20;
BubbleSortApp arr;
arr=new BubbleSortApp(max);

arr.insert(83);
arr.insert(42);
arr.insert(11);
arr.insert(10);
arr.insert(9);
arr.insert(3);
arr.insert(20);
arr.insert(102);
arr.insert(27);
arr.insert(15);
arr.insert(92);
arr.insert(2);
Sytem.out.println("bilangan belum terurut: ");
arr.display();
arr.BubbleSort();
Sytem.out.println("bilangan belum : ");
arr.display();
}
}