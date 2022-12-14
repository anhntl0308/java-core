public class DictionaryWord implements Comparable<DictionaryWord> {
    private String word;
    private String meanings;

    public DictionaryWord(String word, String meanings) {
        this.word=word;
        this.meanings=meanings;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeanings() {
        return meanings;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }
    @Override
    public int compareTo(DictionaryWord dict) {

        return word.compareTo(dict.getWord());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DictionaryWord)) {
            return false;
        }
        return word.equals(((DictionaryWord) obj).getWord());
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }
}

