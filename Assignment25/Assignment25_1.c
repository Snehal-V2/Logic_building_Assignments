// return the difference between sum of the even and odd elements

#include<stdio.h>
#include<stdlib.h>

typedef int* IPTR;
int Difference(int Arr[],int Length)
{
    int iCnt = 0, iSum1 = 0,iEven = 0,iOdd = 0,iSum2 = 0;
  
    for(iCnt=0; iCnt < Length; iCnt++)
    {
       if(Arr[iCnt]%2 == 0)
       {
        iEven = Arr[iCnt];
        iSum1 = iSum1+ iEven;
       }
       else 
       {
        iOdd = Arr[iCnt];
        iSum2 =  iSum2+ iOdd;
       }

    }
    return(iSum1- iSum2);
}

int main()
{
    int iNum = 0, iRet = 0;
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

    iRet = Difference(ptr,iNum);
    printf("The difference between sum of ODD and EVEN numbers is:%d\n",iRet);
    
    free(ptr);
    return 0;
}