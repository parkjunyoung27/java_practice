package ch16_inter;

public class LeastJob implements Scheduler {

	@Override
	public void sendCallToAgent() {
		System.out.println("통화 수가 가장 적은 상담원에게 배분합니다.");

	}

}
