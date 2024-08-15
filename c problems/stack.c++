#include <iostream>
using namespace std;
int MAXSIZE = 8;
int stack[8];
int top = -1;

// Check if the stack is empty
int isfull()
{
    if (top == MAXSIZE)
    {
        return 1;
    }
    else
        return 0;
}

// Insertion operation i.e push()
int push(int data)
{
    if (!isfull())
    {
        top = top + 1;
        stack[top] = data;
    }

    else
    {
        cout << "Stack is full" << endl;
    }
}

int main()
{

    push(5);
    push(85);
    push(78);
    push(45);
    push(96);
    push(21);
    push(10);
    push(14);
    push(12);

    for (int i = 0; i < MAXSIZE; i++)
    {
        cout << stack[i] << " ";
    }
}