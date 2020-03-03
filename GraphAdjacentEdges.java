import java.util.ArrayList;

class Vertex {
    int value = 0;
    boolean isVisited = false;

    Vertex( int value) {
        this.value = value;
    }
}

class Edge {
    int startIndex = 0;
    int endIndex = 0;
    int weight = 0;
    Boolean isDirected = false;

    Edge( int start, int end, int aWeight, Boolean isDirected) {
        this.startIndex = start;
        this.endIndex = end;
        this.weight = aWeight;
        this.isDirected = isDirected;
    }

}


class Graph {
    ArrayList<Edge> edgesList;
    ArrayList<Vertex> verticesList;
    boolean pathExisted = false;
    Graph() {
        edgesList = new ArrayList<>();
        verticesList = new ArrayList<>();
    }

    void addVertex(final Vertex aVertex) {
        if (!verticesList.contains(aVertex)) {
            verticesList.add(aVertex);
        }
    }

    void addEdge(final Edge aEdge) {
        if (!edgesList.contains(aEdge)) {
            edgesList.add(aEdge);
        }
    }

    void findAdjacentVertices(Vertex aVertex){
        if(!verticesList.contains(aVertex)){
            System.out.println("Given vertex is not present in given list");
        }
        for(Edge edge: edgesList){
            if(edge.startIndex == aVertex.value) {
                System.out.println(edge.endIndex);
            }else if(edge.endIndex == aVertex.value){
                System.out.println(edge.startIndex);
            }
        }

    }

    /**
   * Finds whether vertices start and end are connected 
   * @param start start index
   * @param end end index
   * @return true if start and end are part of same edge else returns false.
   */ 
	public boolean isConnected(int start, int end){
		for(Edge edge: edgesList){
			if((edge.startIndex == start && edge.endIndex == end) ||
				(edge.startIndex == end && edge.endIndex == start))
				return true;
		}
		return false;
    }
    

    /**
   * Finds if there is path  
   * @param start start index
   * @param end end index
   * @return true if start and end are part of same edge else returns false.
   */ 
	public boolean isPathAvailable(int start, int end){
        for(Edge edge: edgesList){
			if(edge.startIndex == start){
                if(edge.endIndex == end){
                    return true;
                }else{
                    isPathAvailable(edge.endIndex, end);
                }
            }
        }
		return false;
	}

    public Vertex getVertex(int value){
        Vertex result = new Vertex(value);
        for(Vertex temp: verticesList){
            if(temp.value == value){
            }
        }
        return result;
    }
    public void getAdjucentNodes(int start, int end){
        for(Edge edge: edgesList){
			if(edge.startIndex == start){
                getAdjucentNodes(edge.startIndex,end);
            }
        }
    }
}


public class GraphAdjacentEdges {
    public static void main(String[] args) {

        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        Vertex vertex6 = new Vertex(6);

        Graph graph = new Graph();
        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);
        graph.addVertex(vertex5);
        graph.addVertex(vertex6);

        Edge edge1 = new Edge(1, 2, 0, false);
        Edge edge2 = new Edge(1, 4, 0, false);
        Edge edge3 = new Edge(1, 5, 0, false);
        Edge edge4 = new Edge(2, 3, 0, false);
        Edge edge5 = new Edge(2, 5, 0, false);
        Edge edge6 = new Edge(2, 6, 0, false);
        Edge edge7 = new Edge(3, 6, 0, false);
        Edge edge8 = new Edge(4, 5, 0, false);
        Edge edge9 = new Edge(5, 6, 0, false);

        graph.addEdge(edge1);
        graph.addEdge(edge2);
        graph.addEdge(edge3);
        graph.addEdge(edge4);
        graph.addEdge(edge5);
        graph.addEdge(edge6);
        graph.addEdge(edge7);
        graph.addEdge(edge8);
        graph.addEdge(edge9);


        //graph.findAdjacentVertices(vertex2);
        //System.out.println(graph.isConnected(1, 2));
        System.out.println(graph.isPathAvailable(1, 6));

    }
}