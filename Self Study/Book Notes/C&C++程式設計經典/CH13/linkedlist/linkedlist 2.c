#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

int main(int argc, char *argv[])
{
      struct node
    {
		char name[10];
		int age;
		struct node *next;
	};

	struct node *head,*ptr,*newptr;
	int i;
	/*  產生 node 1  */
	newptr=(struct node*)malloc(sizeof(struct node));
	strcpy(newptr->name,"David");
	newptr->age=20;
	newptr->next=NULL;
	head=ptr=newptr;
	ptr=newptr;

	/*  產生 node 2  */
	newptr=(struct node*)malloc(sizeof(struct node));
	strcpy(newptr->name,"Tom");
	newptr->age=24;
	newptr->next=NULL;

	ptr->next=newptr;
	ptr=newptr;

	/*  產生 node 3  */
	newptr=(struct node*)malloc(sizeof(struct node));
	ptr->next=newptr;
	strcpy(newptr->name,"Fred");
	newptr->age=30;
	newptr->next=NULL;

	ptr->next=newptr;
	ptr=newptr; 
	/*   顯示所有資料  */
	ptr=head;
	i=1;
	while(ptr!=NULL)
	{
		printf("\nnode %d ==> 姓名 : %s",i++,ptr->name);
		printf("\t   年齡 : %d\n",ptr->age);
		ptr=ptr->next;
	}
    printf("\n");
    system("PAUSE");	
    return 0;
}
