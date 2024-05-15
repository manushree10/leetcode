/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
        int temp1,i,j,cnt=0;
        struct ListNode* first;
        struct ListNode* cur;
        struct ListNode* a;
      if(list1==NULL && list2==NULL)
      {
          return NULL;
      }
     if(list1==NULL && list2!=NULL)
     {
         return list2;
     }
    cur=list1;
    while(cur->next!=NULL)
    {
        cur=cur->next;
    }
    cur->next=list2;
    first=list1;
    while(first!=NULL)
    {
        cnt++;
        first=first->next;
    }
    for(i=0;i<cnt-1;i++)
    {
        a=list1;
        for(j=0;j<cnt-i-1;j++)
        {
            if(a->val>(a->next)->val)
            {
                temp1=a->val;
                a->val=(a->next)->val;
                (a->next)->val=temp1;
                
            }
            a=a->next;
        }
    }
    return list1;
}