#include <iostream>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;
};

void LinkedListTraversal(struct Node *ptr)
{
    cout << "Forward traversal" << endl;
    while (ptr != NULL)
    {
        cout << "Element: " << ptr->data << endl;
        ptr = ptr->next;
    }
}

void LinkedListTraversalReverse(struct Node *head)
{
      struct Node *ptr = (struct Node*)malloc(sizeof(struct Node));
      ptr=head;
    cout << "Reverse Traversal" << endl;
    while (ptr!= NULL)
    {
        ptr = ptr->next;
    }

    while (ptr!= NULL)
    {
        cout << "Element: " << ptr->data << endl;
        ptr = ptr->prev;
    }
}
int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;
    struct Node *fifth;

    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));
    fifth = (struct Node *)malloc(sizeof(struct Node));

    // Linking the nodes
    head->data = 10;
    head->prev = NULL;
    head->next = second;

    second->data = 20;
    second->prev = head;
    second->next = third;

    third->data = 30;
    third->prev = second;
    third->next = fourth;

    fourth->data = 40;
    fourth->prev = third;
    fourth->next = fifth;

    fifth->data = 50;
    fifth->prev = fourth;
    fifth->next = NULL;

    // LinkedListTraversal(head);
    LinkedListTraversalReverse(head);
    return 0;
}
