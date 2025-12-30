// count the frequency of  even number

#include<stdio.h>
#include<stdlib.h>

typedef int* IPTR;

int CountEven(int Arr[],int iSize)
{
    int ifreq = 0,iCount=0;
    for (iCount = 0; iCount < iSize; iCount++)
    {
        if(Arr[iCount]%2 == 0)
        {
            ifreq++;
        }
        
    }return ifreq;
    

}

int main()
{
    int iNum = 0,iCount = 0, iRet = 0;
    IPTR ptr = NULL;

    printf("Enter the size of an array:\n");
    scanf("%d",&iNum);

    ptr = (IPTR) malloc(iNum * sizeof(int));

    for(iCount = 0; iCount < iNum; iCount++)
    {
        scanf("%d",&ptr[iCount]);

    }
   

    iRet = CountEven(ptr,iCount);
    printf("The frequency of even number is: %d\n",iRet);



    return 0;
}