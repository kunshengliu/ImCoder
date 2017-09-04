package jianzhiofffer.tree;
/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No��
 * �������������������������ֶ�������ͬ��
 * @author lliukunsheng
 *
 */
public class Main2 {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence==null||sequence.length<=0) {
    		return false;
    	}
    	return VerifySquenceOfBST(sequence, 0, sequence.length-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence,int start,int end) {
    	if(start>=end) {
    		return true;
    	}
    	int root =sequence[end];
    	int i=start;
    	while(sequence[i]<root) {
    		i++;
    	}
    	int j=i;
    	while(j<end) {
    		if(sequence[j]<root) {
    			return false;
    		}
    		j++;
    	}
    	boolean left = VerifySquenceOfBST(sequence,start,i-1);
    	boolean right =VerifySquenceOfBST(sequence,i,end-1);
    	return left&&right;
    }    
}
