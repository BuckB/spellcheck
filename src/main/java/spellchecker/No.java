/**
 * 
 */
package spellchecker;

/**
 * @authors Bruno Buck Brigagão e Filipe Gonçalves
 *
 */
class No {
	public String palavra;
    //public HybridDictionary Children { get; set; }
 
    public No() { }
 
    public No(String palavra)
    {
        this.palavra = palavra.toLowerCase();
    }
 
    public No this[int key]
    {
        get { return (No)Children[key]; }
    }
 
    public ICollection Keys
    {
        get
        {
            if(Children == null)
                return new ArrayList();
            return Children.Keys;
        }
    }
 
    public bool ContemChave(int chave)
    {
        return Children != null && Children.Contem(chave);
    }
 
    public void Adi(int key, string word)
    {
        if(this.Children == null)
            Children = new HybridDictionary();
        this.Children[key] = new Node(word);
    }
}
