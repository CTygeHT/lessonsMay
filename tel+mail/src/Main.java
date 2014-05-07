import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("tel+mail.txt"));
        String line;
        try {
            BufferedWriter outTel = new BufferedWriter(new FileWriter("tel.txt"));
            try {
                BufferedWriter outMail = new BufferedWriter(new FileWriter("mail.txt"));
                try {
                    while ((line = in.readLine()) != null) {
                        if (line.contains("+")) {
                            outTel.write(line);
                            outTel.newLine();
                        } else {
                            outMail.write(line);
                            outMail.newLine();
                        }
                    }
                } finally {
                    outMail.close();
                }
            } finally {
                outTel.close();
            }
        } finally {
            in.close();
        }


    }
}
