
import com.blankj.utilcode.util.ToastUtils;
import com.teixeira.vcspace.editor.snippet.Snippet;
import com.teixeira.vcspace.plugins.helper.FileHelper;

import java.util.List;

public void main() {
  ToastUtils.showShort("Loading Java Snippets");
    
  String myPluginPath = PLUGIN_DIR + "/" + manifest.getPackageName();  
  String snippetsPath = myPluginPath + "/snippets/java.snippets.json";
  
  List<Snippet> snippets = helper.loadSnippets(snippetsPath);
  snippetController.addJavaSnippet(snippets.toArray(new Snippet[0]));
  
  ToastUtils.showShort("Java Snippets are loaded successfully 😊");
}