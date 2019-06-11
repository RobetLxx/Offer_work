package Offer_week1;/** * @author: lingjunhao * create at:  19/4/20  下午6:34 * @description: 矩阵中的路径 */public class Solution11 {    public boolean hasPath(char[][] matrix, String str) {        if (str==null)return false;        if (str.length()==1){            for (int i = 0; i < matrix.length; i++) {                for (int j = 0; j < matrix[i].length; j++) {                    if (matrix[i][j]==str.charAt(0)){                        return true;                    }                }            }        }        for (int i = 0; i < matrix.length; i++)            for (int j=0;j<matrix[i].length;j++)                if (dfs(matrix,str,0,i,j))                    return true;                return false;    }    //u为枚举路径，x为起点，y为终点    boolean dfs(char[][] matrix,String str,int u,int x,int y){        if (u==str.length())return true;//如果路径长度与字符串长度一致即表示拥有这条路径。        if (matrix[x][y]!=str.charAt(u))return false;        int dx[]={-1,0,1,0};//上右下左x-1,x不变，x+1，x不变        int dy[]={0,1,0,-1};        char t=matrix[x][y];        matrix[x][y]='*';        for (int i = 0; i < 4; i++) {            int a=x+dx[i],b=y+dy[i];            if (a>=0&&a<matrix.length&&b>=0&&b<matrix[a].length){                if (dfs(matrix, str, u+1, x, y))return true;            }        }        matrix[x][y]=t;        return false;    }}