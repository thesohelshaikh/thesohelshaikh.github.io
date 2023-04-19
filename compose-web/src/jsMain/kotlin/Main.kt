import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.DirType
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.Image

fun main() {

    renderComposable(rootElementId = "root") {
//        Div (attrs = {
//            style {
//                backgroundColor(Color.black)
//                height(100.vh)
//                width(100.vw)
//            }
//        }){
//        }

        Div(
            attrs = {
                style {
                    display(DisplayStyle.Flex)
                    color(Color.black)
                    background("#EEE")
                    alignItems(AlignItems.Center)
                    justifyContent(JustifyContent.Center)
                    height(100.vh)
                    margin(0.px)
                    padding(0.px)
                    fontFamily("Helvetica")
                    flexDirection(FlexDirection.Column)
                    position(Position.Relative)
                }
            },
        ) {

            Div {
                Img(
                    src = "https://molo17.com/wp-content/uploads/2019/03/IMG_20190304_180316__01_compressed.jpg",
                    attrs = {
                        style {
                            opacity(0.1)
                            maxWidth(100.vw)
                            maxHeight(100.vh)
                            width(100.percent)
                        }
                    })
            }
            Div(
                attrs = {
                    style {
                        position(Position.Absolute)
                        width(60.percent)
                        textAlign("center")
                    }
                }
            ) {

                H1 (
                    attrs = {
                        style {
                            fontSize(6.vh)
                        }
                    }
                ){
                    Text("Hi, I am Sohel")
                    Br()
                    Text("Android Engineer")
                    Br()
                    Text("based in GJ, India.")
                    Br()
                }

                Span (
                    attrs = {
                        style {
                            fontSize(1.5.em)
                        }
                    }
                ){
                    Text("Building simple and beautiful things for complex interfaces is what I enjoy most about my work. I am also interested in crafting beautiful minimal products and exploring new worlds.")

                }
                Br()
                Br()
                Text("I like ")
                A(
                    attrs = {
                        href("https://twitter.com/thesohelshaikh")
                        target(ATarget.Blank)
                    }
                ) {

                        Text("tweeting")
                }
                Text(", solving ")
                A(
                    attrs = {
                        href("https://stackoverflow.com/users/7279304/sohel-shaikh")
                        target(ATarget.Blank)
                    }
                ) {
                        Text("problems")
                }
                Text(", taking ")
                A(
                    attrs = {
                        href("https://www.instagram.com/thesohelshaikh/")
                        target(ATarget.Blank)
                    }
                ) {
                        Text("photos")
                }
                Text(", writing ")
                A(
                    attrs = {
                        href("https://github.com/thesohelshaikh")
                        target(ATarget.Blank)
                    }
                ) {
                        Text("code.")
                }
            }
            Div(attrs = {
                style {
                    textAlign("center")
                    position(Position.Absolute)
                    bottom(5.percent)
                }
            }) {
                Text("Made with 💜 using ")

                A (attrs = {
                    href("https://www.jetbrains.com/lp/compose-multiplatform/")
                }){
                    Text("Compose")
                }
                Text(" and Kotlin.")
            }


        }
    }
}

