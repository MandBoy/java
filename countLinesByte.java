/*
    //kan ikke redegoere for denne.
    public int countLines(String filePath) throws IOException {

        InputStream is = new BufferedInputStream(new FileInputStream(filePath));
        int count = 0;
        try {
            byte[] c = new byte[1024];
            int readChars = is.read(c);

            if (readChars == -1) {
                // bail out - hvis der intet er at laese
                return 0;
            }
            // Laes filen igennem for chars af en blok paa 1024.

            while (readChars == 1024) {
                for (int i = 0; i < 1024; ) {
                    if (c[i++] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            // count remaining characters
            while (readChars != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }
        } catch (IOException e) {
            System.out.println("Fejl: " + e);
            is.close();
        }
        is.close();
        return count == 0 ? 1 : count;
    }

    */
