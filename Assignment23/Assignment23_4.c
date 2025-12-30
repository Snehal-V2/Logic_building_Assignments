// Display element in the range 
#include<stdio.h>
#include<stdlib.h>



typedef int* IPTR;
void Range(int Arr[],int iStart,int iEnd, int iSize)
{   
   int iCnt = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] >= iStart && Arr[iCnt] <= iEnd)
        {
            printf("The element of the array:%d\n ",Arr[iCnt]);
        }  
    }    
}

int main()
{
    int iNum = 0,iRange1=0, iRange2 = 0, iRet = 0;
    IPTR ptr = NULL;

    printf("Enter the size of array:\n");
    scanf("%d", &iNum);

    ptr = (int *)malloc(iNum * sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory allocation failed\n");
        return -1;
    }

    printf("Enter starting of the  range:\n");
    scanf("%d", &iRange1);

    printf("Enter end of the range:\n");
    scanf("%d", &iRange2);

    printf("Enter %d elements:\n", iNum);
    for (int i = 0; i < iNum; i++)
    {
        scanf("%d", &ptr[i]);
    }


    Range(ptr, iRange1,iRange2,iNum);
    
  
    free(ptr);
    return 0;
}