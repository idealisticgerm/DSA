#include <iostream>
using namespace std;
struct Node
{
    int data;
    struct Node *next;
};

void LinkListTraversal(struct Node *ptr)
{
    while (ptr != NULL)
    {
        cout << "Element: " << ptr->data << endl;
        ptr = ptr->next;
    }
}

struct Node *DeleteAtFirst(struct Node *head)
{
    struct Node *p = head;
    head = head->next;
    free(p);
    return head;
}

struct Node *DeleteAtIndex(struct Node *head, int index)
{
    struct Node *p = head;
    struct Node *q = head->next;

    for (int i = 0; i < index - 1; i++)
    {
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    free(q);
    return head;
}

struct Node *DeleteAtLast(struct Node *head)
{
    struct Node *p = head;
    struct Node *q = head->next;

    while (q->next != NULL)
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
}

struct Node *DeleteByValue(struct Node *head, int value)
{
    struct Node *p = head;
    struct Node *q = head->next;

    while (q->data != value && q->next != NULL)
    {
        p = p->next;
        q = q->next;
    }
    if (q->data == value)
    {
        p->next = q->next;
        free(q);
    }
    return head;
}

int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *fourth;
    struct Node *fifth;

    // Allocate memory to nodes
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    fourth = (struct Node *)malloc(sizeof(struct Node));
    fifth = (struct Node *)malloc(sizeof(struct Node));

    // Link first node and second node and so on
    head->data = 35;
    head->next = second;

    second->data = 85;
    second->next = third;

    third->data = 21;
    third->next = fourth;

    fourth->data = 82;
    fourth->next = fifth;

    fifth->data = 10;
    fifth->next = NULL;

    cout << "Before Deletion" << endl;
    LinkListTraversal(head);
    cout << "After Deletion" << endl;
    // head = DeleteAtFirst(head);
    // head = DeleteAtIndex(head, 2);
    // head = DeleteAtLast(head);
    head = DeleteByValue(head, 82);
    LinkListTraversal(head);
    return 0;
}