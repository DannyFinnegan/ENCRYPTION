package rowColumn;

public class rowColumnEncrytion {
    public static String encrypt(String plaintext, int key) {
        int columns = key;
        int rows = (int) Math.ceil((double) plaintext.length() / columns);
        char[][] matrix = new char[rows][columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (index < plaintext.length()) {
                    matrix[i][j] = plaintext.charAt(index++);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                sb.append(matrix[j][i]);
            }
        }
        return sb.toString();
    }

    public static String decrypt(String ciphertext, int key) {
        int columns = (int) Math.ceil((double) ciphertext.length() / key);
        int rows = key;
        char[][] matrix = new char[rows][columns];
        int index = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (index < ciphertext.length()) {
                    matrix[j][i] = ciphertext.charAt(index++);
                } else {
                    matrix[j][i] = ' ';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sb.append(matrix[i][j]);
            }
        }
        return sb.toString().replaceAll("\\s+", "");
    }
}