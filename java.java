🧩 1. 方法与控制结构（Methods and Control Structures）
public class ClassName {
    // 预设的辅助方法
    public static boolean helperMethod(int param) {
        // 实现细节
        return true;
    }

    // 主要方法
    public static int mainMethod(int param1, int param2) {
        int result = 0;
        for (int i = param1; i <= param2; i++) {
            if (helperMethod(i)) {
                result++;
            }
        }
        return result;
    }
}


🧱 2. 类的设计（Class Design）
public class CustomClass {
    private int attribute1;
    private String attribute2;

    public CustomClass(int attr1, String attr2) {
        attribute1 = attr1;
        attribute2 = attr2;
    }

    public void updateAttribute1(int value) {
        attribute1 += value;
    }

    public String getAttribute2() {
        return attribute2;
    }
}

📚 3. 数组与ArrayList（Array and ArrayList）
import java.util.ArrayList;

public class ListProcessor {
    private ArrayList<String> items;

    public ListProcessor() {
        items = new ArrayList<String>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean removeItem(String item) {
        return items.remove(item);
    }

    public int countItemsContaining(String substring) {
        int count = 0;
        for (String item : items) {
            if (item.contains(substring)) {
                count++;
            }
        }
        return count;
    }
}

🧮 4. 二维数组（2D Array）
  public class MatrixAnalyzer {
    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int val : matrix[row]) {
            sum += val;
        }
        return sum;
    }

    public static boolean isColumnUniform(int[][] matrix, int col) {
        int first = matrix[0][col];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] != first) {
                return false;
            }
        }
        return true;
    }
}
