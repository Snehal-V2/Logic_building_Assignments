
#include<stdio.h>
#include<stdlib.h>



typedef int* IPTR;
int Product(int Arr[], int iSize)
{   
   int iCnt = 0, iAns=1;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
       if(Arr[iCnt]%2 != 0 )
       {
            iAns = iAns * Arr[iCnt];

       }
    
    }   
     return iAns;
}

int main()
{
    int iNum = 0, iRet = 0;
    IPTR ptr = NULL;

    printf("Enter the size of array:\n");
    scanf("%d", &iNum);

    ptr = (int *)malloc(iNum * sizeof(int));
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


   iRet= Product(ptr,iNum);
   printf("The product of Number is:%d\n",iRet);
    
  
    free(ptr);
    return 0;
}