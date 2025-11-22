#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <limits.h>


typedef struct TreeNode{
    struct TreeNode* left;
    struct TreeNode* right;
    int value;
}TreeNode;

TreeNode* createNode(int value){
    TreeNode* newNode = (TreeNode*)malloc(sizeof(TreeNode));
    if(!newNode){
        printf("Unable to create Node :");
        return NULL;
    }
    newNode->value = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void preOrder(TreeNode* root){
    if(root == NULL){
        return;
    }
    printf("%d ", root->value);
    preOrder(root->left);
    preOrder(root->right);
}

void InOrder(TreeNode* root){
    if(root == NULL){
        return;
    }
    InOrder(root->left);
    printf("%d ", root->value);
    InOrder(root->right);
}


// find the diameter of a binary tree
int heightOfBT(TreeNode* root){
    if(root == NULL){
        return 0;
    }
    int leftHeight = heightOfBT(root->left);
    int rightHeight = heightOfBT(root->right);
    return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
}

int diameterOfBT(TreeNode* root){
    if(root == NULL){
        return 0;
    }
    int leftHeight = heightOfBT(root->left);
    int rightHeight = heightOfBT(root->right);
    int leftDiameter = diameterOfBT(root->left);
    int rightDiameter = diameterOfBT(root->right);
    
    int throughRoot = leftHeight + rightHeight;
    int maxDiameter = (leftDiameter > rightDiameter) ? leftDiameter : rightDiameter;
    
    return (throughRoot > maxDiameter) ? throughRoot : maxDiameter;
}


// convert sorted array to bst
// [-10,-3,0,5,9]

TreeNode* build(int* nums, int n ,int curIndex){
    if(curIndex >= n){
        return NULL;
    }
    TreeNode* current = createNode(nums[curIndex]);
    current->left = build(nums, n,2* curIndex+1);
    current->right = build(nums, n,2* curIndex+2);
    return current;
}

TreeNode* sortedArrayToBST(int* nums, int numsSize) {
    return build(nums,numsSize, 0);
}


// Binary tree max path sum -> DFS -> post order traversal

int maxPath;
int max(int a, int b){
    return a>b ? a : b;
}

int maxDownward(TreeNode* root){
    if (root == NULL) return 0;
    int left = max(0, maxDownward(root->left));
    int right = max(0, maxDownward(root->right));
    int throughRoot = left + right + root->value;
    if (throughRoot > maxPath)
        maxPath = throughRoot;
    return root->value + max(left, right);
}

int MaxPathSum(TreeNode* root){
    // post order traversal used 
    maxPath = INT_MIN;
    maxDownward(root);
    return maxPath;
}



// sum root to leaf numbers in BT
int SumAllNodes(TreeNode* root){
    if(root == NULL){
        return 0;
    }
    int left = SumAllNodes(root->left);
    int right = SumAllNodes(root->right);
    return root->value + left + right;
}


// WAF for smallest lexicograpical string starting from leat in bt


void main(){
    TreeNode* root = createNode(23);
    root->left = createNode(12);
    root->right  = createNode(33);
    root->left->left = createNode(2);
    root->left->right = createNode(15);
    root->right->left = createNode(22);
    root->right->right = createNode(45);

    // inorder of bst is a sorted array
    // InOrder(root);
    // printf("\n ");
    // int diameter = diameterOfBT(root);
    // printf("%d\n ", diameter);

    int nums[] = {-10,-3,0,5,9};
    int n = 5;
    TreeNode* root1 = sortedArrayToBST(nums, n);
    preOrder(root1);

    printf("\n%d\n ",maxDownward(root1));
    printf("%d\n ", SumAllNodes(root));// 152
}