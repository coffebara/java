package programmers;
//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
public class days8_4 {
	public static int Solution(int[] num_list) {
        int answer = 0;
        int sum=0;
        int multi =1;
        for(int i=0; i<num_list.length; i++) {
            sum += num_list[i];
            multi *= num_list[i];
        }
        System.out.println("sum의 제곱은 : "+ sum*sum);
        System.out.println("multi는 : "+multi);
        if(multi > sum*sum){
            answer = 0;
        } else if(multi < sum*sum){
            answer = 1;
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {5,7,8,3};
		System.out.println(Solution(arr));
	}
}
