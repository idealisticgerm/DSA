#include <iostream>
using namespace std;

void print_array(int *a, int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << a[i] << " ";
    }
    cout << "\n";
}

void bubble_sort(int *a, int size)
{
    int isSorted = 0;
    for (int i = 0; i < size - 1; i++)
    {
        cout << "Working on pass " << i + 1 << endl;
        isSorted = 1;
        for (int j = 0; j < size - 1 - i; j++)
        {
            if (a[j] > a[j + 1])
            {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                isSorted = 0;
            }
        }
        if (isSorted)
        {
            return;
        }
    }
    cout << "\n";
}
int main()
{
    int a[] = {14, 52, 7, 4, 75, 50};
    int n = sizeof(a) / sizeof(int);
    print_array(a, n); // before sorting
    bubble_sort(a, n);
    print_array(a, n); // after sorting

    return 0;
}