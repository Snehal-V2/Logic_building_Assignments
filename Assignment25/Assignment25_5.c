// Numbers which are multiple of 11
#include<stdio.h>
#include<stdlib.h>

typedef int* IPTR;
void Multiple(int Arr[],int Length)
{
    int iCnt = 0;
    printf("Numbers that are multiples of 11 are:");
    
    for(iCnt=0; iCnt < Length; iCnt++)
    {
      
        if(Arr[iCnt] %11 == 0) 
        {
            printf("%d\n", Arr[iCnt]);
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

     Multiple(ptr,iNum);
   
    
    free(ptr);
    return 0;
}