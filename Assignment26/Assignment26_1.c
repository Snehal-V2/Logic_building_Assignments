/* input    =   5

    output  =  A    B   C   D   E

*/
#include<stdio.h>
void Pattern(int iNo)
{
    char ch = 'A';
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++,ch++)
    {
        printf("%c\t",ch);
    }
    printf("\n");
}
int main()
{
    int iValue = 0;
    printf("Enter the number:");
    scanf("%d",&iValue);

    Pattern(iValue);




    return 0;
}