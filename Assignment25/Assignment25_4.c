// Divisible by 3 and 5
#include<stdio.h>
#include<stdlib.h>

typedef int* IPTR;
void DivisibleByFive(int Arr[],int Length)
{
    int iCnt = 0;
    
    for(iCnt=0; iCnt < Length; iCnt++)
    {
      
        if(Arr[iCnt] %5 == 0 && Arr[iCnt]%3 == 0) 
        {
            printf("The numbers which are  divisible by 3 and 5 are :%d\n", Arr[iCnt]);
        }
    }  
    printf("\n");
}
    



int main()
{
    int iNum = 0;
    IPTR ptr = NULL;

    printf("Enter the size of array:\n");
    scanf("%d", &iNum);

    ptr = (int*)malloc(iNum * sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory allocation failed\n");
        return -1;
    }

    printf("Enter %d elements:\n", iNum);
    for (int i = 0; i < iNum; i++)
    {
        scanf("%d", &ptr[i]);
    }

    DivisibleByFive(ptr,iNum);
   
    
    free(ptr);
    return 0;
}