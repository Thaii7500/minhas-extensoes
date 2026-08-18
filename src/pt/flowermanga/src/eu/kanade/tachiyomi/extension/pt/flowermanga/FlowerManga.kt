package eu.kanade.tachiyomi.extension.pt.flowermanga

import eu.kanade.tachiyomi.multisource.mangathemesia.MangaThemesia
import java.text.SimpleDateFormat
import java.util.Locale

class FlowerManga : MangaThemesia(
    "Flower Mangá",
    "https://flowermangas.net",
    "pt-BR"
) {
    override val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale("pt", "BR"))
}
