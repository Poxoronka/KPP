package control;//package control;
//
//import java.util.function.Consumer;
//import javafx.event.Event;
//import javafx.event.EventHandler;
//import javafx.scene.control.Button;
//import javafx.scene.input.MouseEvent;
//
//public class Handler <T>{
//
//    //	static EventHandler<Event> currentHandler = new EventHandler<Event>(){
////		@Override
////		public void handle(Event e) {
////
////		}
////	};
//    static EventHandler<MouseEvent> oldHandler;
//
//    public static <X, Y, T> void handle(
//            X x,
//            Y y,
//            T t,
//            Consumer<T> removeOldHandler,
////			Consumer<T> setNewHandler,
//            Consumer<X> function,
//            Consumer<Y> changeStatusText,
//            Consumer<Y> changeButtonText){
//
//        //removeOldHandler.accept(t);
//
//        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent e) {
//
//                changeStatusText.accept(y);
//                changeButtonText.accept(y);
//
//                if(x!=null)
//                    function.accept(x);
//            }
//        };
//
//        ((Button) t).addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
//
//        oldHandler = handler;
//    }
//
//    public static void setOldHandler(EventHandler<MouseEvent> h) {oldHandler=h;}
//    public static EventHandler<MouseEvent> getOldHandler() { return oldHandler; }
//
//}
