package homework;

import java.util.Scanner;

public class Campus {
	
	private int[][] route;
	private int size;
	public void setRoute(int[][] route) {
		this.route = route;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int[][] getRoute() {
		return route;
	}
	public int getSize() {
		return size;
	}
	public void init() {
		int x, y, r;
		for(int i = 0;i<this.size;++i) {
			for(int j = 0;j<this.size;++j) {
				this.route[i][j] = 1000;
			}
		}
		System.out.println("�밴��x,y,Ȩֵ���룬ȨֵΪ0����");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();y = sc.nextInt(); r = sc.nextInt();
		while(r != 0) {
			this.route[x][y] = r;
			x = sc.nextInt();y = sc.nextInt(); r = sc.nextInt();
		}
	}
	
	public int[][] findRoute(int start) {
		//��ά����result�еĵ�һ��������¼��㵽��i�����̾��룬�ڶ��м�¼����i���ǰ���ڵ�
		int[][] result = new int[2][this.size];
		int vex = 0,min;
		int[] found = new int[this.size];
		//�Խ�������״̬������г�ʼ��
		for(int i=0;i<this.size;++i) {
			found[i] = 0;
			result[0][i] = route[start][i];
			result[1][i] = start;
		}
		result[0][start] = 0;
		found[start] = 1;
		result[1][start] = -1;
		for(int i=0;i<this.size;++i) {
			min = 1000;
			for(int j=0;j<this.size;++j) {
				if(found[j] != 1 && result[0][j] < min) {
					min = result[0][j];
					vex = j;
				}
			}
			found[vex] = 1;
			for(int j=0;j<this.size;++j) {
				if(found[j] != 1 && this.route[vex][j] != 1000) {
					if(min + this.route[vex][j] < result[0][j])
						result[0][j] = min + this.route[vex][j];
						result[1][j] = vex;
				}
			}
		}
		return result;
	}
}
