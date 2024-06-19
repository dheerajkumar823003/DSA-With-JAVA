#include<stdio.h>
#include<conio.h>
int main(){
    int i,j,n;
    printf("Enter the number:");
    scanf("%d",&n);
    for(i=1; i<=6; i++){
        for(j=1; j<=6; j++){
            if(j==1||(i==1&&j<=5)||(i==6&&j<=5)||((i>=2&&i<=5)&&j==6)){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    for(i=n/2; i<=n; i+=2){
        for(j=1; j<n-i; j+=2){
            printf(" ");
        }
        for(j=1; j<=i; j++){
            printf("*");
        }
        for(j=1; j<=n-i; j++){
            printf(" ");
        }
        for(j=1; j<=i; j++){
            printf("*");
        }
        printf("\n");
    }
    for(i=n; i>=1; i--){
        for(j=i; j<n; j++){
            printf(" ");
        }
        for(j=1; j<=(i*2)-1; j++){
            printf("*");
        }
        printf("\n");
    }
    for(i=1; i<=5; i++){
        for(j=1; j<=5; j++){
            if(i==1||i==3||i==5||(i==4&&j==5)||(i==2&&j==1)){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
}