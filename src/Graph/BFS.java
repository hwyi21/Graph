package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFS {

	public BFS() {
		Map<String, String[]> graph = new HashMap<String, String[]>();
		String[][] value  = {{"B", "C"}, {"A", "D"},{"A", "G", "H", "I"}, {"B","E","F"},{"D"},{"D"},{"C"},{"C"},{"C","J"},{"I"}}; 
		graph.put("A", value[0]);
		graph.put("B", value[1]);
		graph.put("C", value[2]);
		graph.put("D", value[3]);
		graph.put("E", value[4]);
		graph.put("F", value[5]);
		graph.put("G", value[6]);
		graph.put("H", value[7]);
		graph.put("I", value[8]);
		graph.put("J", value[9]);
		System.out.println(bfs(graph, "A"));
		
	}
	
	public List bfs(Map graph, String start_node) {
		List visit = new ArrayList();
		Queue<String> need_visit = new LinkedList<String>(); 
		
		need_visit.add(start_node);
		while(need_visit.size()!=0) {
			String node = need_visit.poll();
			if(!visit.contains(node)) {
				visit.add(node);
				String[] s = (String[]) graph.get(node);
				for(int i=0; i<s.length; i++) {
					String a = s[i];
					need_visit.add(a);
				}
			}
		}
		return visit;	
	}
	
	public static void main(String[] args) {
		new BFS();
	}

}
