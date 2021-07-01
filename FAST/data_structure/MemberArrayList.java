package data_structure;

import java.util.ArrayList;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i); // member 값 
			
			int tempId = member.getMemberId(); // 멤버ID
			if(tempId == memberId) { //멤버값이 입력값과 같으면 제거 
				arrayList.remove(i);
				return true;
			}
		}
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;

	}

	public void showAlMember() {
		
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
