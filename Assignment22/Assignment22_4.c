// Accept number  N from user and check wheather 11 is in it.
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>


bool Checkwhether(int Arr[], int iSize,int iNo) 
{
    int iCount = 0;

    for(iCount = 0; iCount < iSize; iCount++)
    {
        if (Arr[iCount] == iNo)
        {
            return true;
        }
        
    }return false;    

}

int main()
{
    int iLength = 0;
    int *ptr = NULL;
    int iCnt = 0, iNum=0;
    bool bRet = 0;

    printf("Enter the number of elements");
    scanf("%d",&iLength);

    ptr = (int*)malloc(iLength * sizeof(int));
    if(ptr == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }
    printf("Enter the element:\n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }
     
    printf("Enter the number\n");
    scanf("%d",&iNum);

    bRet = Checkwhether(ptr,iLength, iNum);

    if(bRet == true)
    {
        printf("%d Number is present.\n",iNum);
    }
    else
    {
        printf("%d Not Present.\n",iNum);
    }

    free(ptr);

    return 0;
}



